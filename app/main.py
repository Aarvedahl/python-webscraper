from flask import Flask

app = Flask(__name__)


@app.route('/')
def hello():
    return 'Hello World! I have been seen 1 times'


if __name__ == "__main__":
    # Only for debugging while developing
    app.run(host='0.0.0.0', debug=True, port=80)