#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-SCRIPT
  CREATE DATABASE crud_example_db;

  \c crud_example_db;

  CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
SCRIPT