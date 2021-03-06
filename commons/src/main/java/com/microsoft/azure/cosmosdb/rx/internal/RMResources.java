/*
 * The MIT License (MIT)
 * Copyright (c) 2018 Microsoft Corporation
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.microsoft.azure.cosmosdb.rx.internal;

public class RMResources {
    public static final String UnknownResourceType = "Resource type %s is unknown";
    public static final String InvalidDocumentCollection = "The specified document collection is invalid.";
    public static final String StringArgumentNullOrEmpty = "String agument %s is null or empty";
    public static final String PartitionKeyAndParitionKeyRangeIdBothSpecified = "Both Partition Key and Partition Key range are Specified in %s";
    public static final String PartitionKeyRangeIdOrPartitionKeyMustBeSpecified = "One of the partition key range id or partition key must be specified";
    public static final String TooFewPartitionKeyComponents = "PartitionKey has fewer components than defined the collection resource.";
    public static final String TooManyPartitionKeyComponents = "PartitionKey has more components than defined the collection resource.";
    public static final String UnableToDeserializePartitionKeyValue = "Cannot deserialize PartitionKey value '%s";

    public static final String Gone = "The requested resource is no longer available at the server.";
    public static final String ExceptionMessageAddIpAddress = "%s, Local IP: %s";
    public static final String ExceptionMessage = "Message: %s";
    public static final String ServiceUnavailable = "Service is currently unavailable, please retry after a while. If this problem persists please contact support.";
    public static final String InternalServerError = "Unknown server error occurred when processing this request.";
    public static final String InvalidBackendResponse  = "The backend response was not in the correct format.";
    public static final String PartitionKeyRangeNotFound = "PartitionKeyRange with id %s in collection %s doesn't exist";
    public static final String InvalidConflictResolutionMode = "Invalid mode '%s' for setting '%s'. MODE expected is '%s'.";
    public static final String InvalidRegionsInSessionToken = "Compared session tokens '%s' and '%s' has unexpected regions.";
    public static final String InvalidSessionToken = "The session token provided '%s' is invalid.";
    public static final String ResourceTokenNotFound = "Resource token not found.";
}