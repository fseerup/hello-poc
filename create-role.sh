#!/bin/sh
az ad sp create-for-rbac \
 --name mystuffDeployUser \
 --role Contributor \
 --scopes /subscriptions/14f0e912-9471-4d4e-999c-007db8727504/resourceGroups/rg-mystuff-prod-west-europe
