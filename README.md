# Camel SQS Consumer Example

Example Java Apache Camel Program that consumes messages from an AWS SQS Queue.  The application will connect to the SQS Queue and then log each message received.

## Usage

The Application utilizes a few settings to connect to the SQS Queue:

* __queueURl__: This is the SQS Queue Name
* __region__: This is the AWS Region for the SQS QUEUE
* __key__: This is an IAM User Key.
* __secret__: This is the the IAM User Secert

Once these settings are configured you can run the application and check the console logs for any messages pooled from the queue.
