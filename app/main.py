from flask import Flask

app = Flask(__name__)


@app.route('/')
def hello():
    return 'Hello World! Here you will be able to view the top news'


def callInstagram(hashtag):
    return hashtag


def callTwitter(hashtag):
    return hashtag


@app.route('/topposts')
def getTopPosts():
    hashtag = "cat"
    postsList = [callInstagram(hashtag), callTwitter(hashtag)]
    return "Will return the top posts from instagram and twitter api"


if __name__ == "__main__":
    # Only for debugging while developing
    app.run(host='0.0.0.0', debug=True, port=80)