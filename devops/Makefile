build-image:
        @ docker build -f Dockerfile -t institutobackend:1 .
deploy:
        @ docker volume create pg_tendencia_data
        @ docker network create --driver overlay --scope swarm desarrollo_net || true
        @ docker stack deploy --with-registry-auth -c stack.yml instituto
rm:
        @ docker stack rm instituto
        @ docker volume rm  pg_tendencia_data
        @ docker network rm desarrollo_net
