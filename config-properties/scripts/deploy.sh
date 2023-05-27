#!/bin/bash
set -eo pipefail

SCRIPT_FILE_DIR="$(dirname "$(readlink -f "${BASH_SOURCE:-$0}")")"
PROJECT_HOME_DIR=$(
  cd "${SCRIPT_FILE_DIR}/.."
  pwd
)
export PROJECT_HOME_DIR
export K8S_NAMESPACE=mflyyou-dev
kubectl config use-context colima
export HELM_DIR="${PROJECT_HOME_DIR}/k8s/helm"

kubectl apply -f - <<EOF
apiVersion: v1
kind: Namespace
metadata:
  name: ${K8S_NAMESPACE}
EOF

helm upgrade -i config-properties "${HELM_DIR}" -n $K8S_NAMESPACE \
  -f "${HELM_DIR}/values.yaml" \
  --atomic --timeout 10m
