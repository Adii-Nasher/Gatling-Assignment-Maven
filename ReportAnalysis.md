# User Simulation Report Analysis

![Response Time Ranges](src/images/img1.png?raw=true "Response Time")
### Above chart shows the distribution of response times for the requests made during the load test. The chart presents response times in a range of time buckets or intervals, and each bucket represents a range of response times. The right panel show number of OK/KO requests.

![Global Assertions](src/images/img2.png?raw=true "Assertions")
### Above chart shows global assertions. if it's green then it means it's passed or red if it's failed. First Assertion checks whether response time is between desired range or not and second assertion checks rate of successfull request made during test.

![Summary](src/images/img3.png?raw=true "Summary")
### Above chart shows summary, such as min, max, mean, standard deviation and percentiles globally and per request. If your scenario contains groups, this panel becomes a tree : each group is a non leaf node, and each request is a descendant leaf of a group.

![Active Users](src/images/img4.png?raw=true "Active")
### Above chart shows the number of virtual users that were active at each moment during the simulation. The x-axis of the chart represents the simulation time, and the y-axis shows the number of active virtual users. By examining the chart, you can see how many users were active at any given point in time during the test.

![Response Time](src/images/img5.png?raw=true "Response Time")
### Above chart shows how many requests fall into specific response time ranges. The x-axis shows the response time in milliseconds, and the y-axis shows the number of requests that fell within that range. This chart can help identify the distribution of response times for a particular load test.

![Response Time Percentiles](src/images/img6.png?raw=true "Response Time Percentiles")
### Above chart shows the response time percentiles for the requests made during the load test over time. The chart presents response time percentiles, such as 50th, 75th, 90th, and 99th, and each percentile represents the response time below which a certain percentage of requests fall. The x-axis of the chart represents the simulation time, and the y-axis shows the response time in milliseconds.

![Number of request](src/images/img7.png?raw=true "Number of request")
### Above chart shows he number of requests made per second during the load test. The x-axis of the chart represents the simulation time, and the y-axis shows the number of requests made per second. By examining the chart, you can see how the request rate changes over time during the test.

![Number of response](src/images/img8.png?raw=true "Number of response")
### Above chart shows the number of responses received per second during the load test. The x-axis of the chart represents the simulation time, and the y-axis shows the number of responses received per second.

