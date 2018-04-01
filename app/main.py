from flask import Flask
import requests

app = Flask(__name__)

# Get Tweets by hashtag/location/user

# Make a site to show recent posts from both instagram and twitter from a user with a username

@app.route('/')
def hello():
    r = requests.get('https://github.com/timeline.json')
    print(r.json())
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