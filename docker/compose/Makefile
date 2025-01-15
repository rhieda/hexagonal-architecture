COMPOSE_FILE := docker-compose.yml
PROJECT_NAME := meu-projeto

.DEFAULT_GOAL := start

start:
		echo "Iniciando o projeto..."
		docker-compose -f $(COMPOSE_FILE) -p $(PROJECT_NAME) up -d

stop:
		echo "Parando o projeto..."
		docker-compose -f $(COMPOSE_FILE) -p $(PROJECT_NAME) down

restart: stop start

logs:
		echo "Mostrando os logs..."
		docker-compose -f $(COMPOSE_FILE) -p $(PROJECT_NAME) logs -f

build:
		echo "Construindo as imagens..."
		docker-compose -f $(COMPOSE_FILE) -p $(PROJECT_NAME) build

ps:
		echo "Listando os containers..."
		docker-compose -f $(COMPOSE_FILE) -p $(PROJECT_NAME) ps

prune:
		echo "Removendo imagens não utilizadas..."
		docker image prune

clean: stop
		echo "Limpando o projeto..."
		docker-compose -f $(COMPOSE_FILE) -p $(PROJECT_NAME) down --volumes --rmi all

help:
		echo "Targets disponíveis:"
		grep -E '^[a-zA-Z_-]+:' Makefile | sed 's/:$$//'

.PHONY: start stop restart logs build ps prune clean help