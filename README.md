# fb-bot-boilarplate-java
A facebook bot boilerplate in Java, which can easily be deployed to Heroku.

## How to use
1. Deploy to Heroku with [![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)
2. Copy valid page access token from FB dev console to Heroku Env (`ACCESS_TOKEN`).
3. Copy auto generated `VALIDATION_TOKEN` and `https://<HEROKU_APP_ADDRESS>/webhook` to console webhooks form in FB dev console and enable the webhook.
4. Hit `curl -ik -X POST "https://graph.facebook.com/v2.6/me/subscribed_apps?access_token=<ACCESS_TOKEN>"` in order to subscribe
5. Talk your bot!

## Documentation
- [Webhook API](https://developers.facebook.com/docs/messenger-platform/webhook-reference)
- [Sending API](https://developers.facebook.com/docs/messenger-platform/send-api-reference)

## Licence

[MIT](https://github.com/tcnksm/tool/blob/master/LICENCE)

## Author

[hyurumi](https://github.com/hyurumi)
