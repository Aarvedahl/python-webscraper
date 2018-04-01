#!/usr/bin/env python

FROM python:3

WORKDIR /usr/src/app

COPY requirements.txt ./
RUN pip install --trusted-host pypi.python.org -r requirements.txt

COPY . .

CMD [ "python", "main.py" ]