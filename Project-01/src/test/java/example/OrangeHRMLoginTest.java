package example;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class OrangeHRMLoginTest extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://opensource-demo.orangehrmlive.com")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_6 = Map.ofEntries(
    Map.entry("Accept", "application/json"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("If-None-Match", "ZWs3TwZKMQ7IEEFBrjJOSwRM4nXcQgsOPZKkNJnMS5o="),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("contentType", "application/json"),
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_8 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Origin", "https://opensource-demo.orangehrmlive.com"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_12 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("If-None-Match", "P2cce+UXjeBpq9iWKfHdQlYTyOgflCghtVN0ewu0gZM="),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_13 = Map.ofEntries(
    Map.entry("Accept", "application/json"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Origin", "https://opensource-demo.orangehrmlive.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_14 = Map.ofEntries(
    Map.entry("Accept", "application/json, text/plain, */*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_15 = Map.ofEntries(
    Map.entry("Accept", "application/json"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "no-store, no-cache, must-revalidate, post-check=0, pre-check=0"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );


  private ScenarioBuilder scn = scenario("OrangeHRMLoginTest")
    .exec(
      http("request_0")
        .get("/web/index.php/auth/login")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/web/dist/css/chunk-vendors.css?v=1721393199309")
            .headers(headers_1),
          http("request_2")
            .get("/web/dist/css/app.css?v=1721393199309")
            .headers(headers_1),
          http("request_3")
            .get("/web/dist/js/chunk-vendors.js?v=1721393199309")
            .headers(headers_1),
          http("request_4")
            .get("/web/dist/js/app.js?v=1721393199309")
            .headers(headers_1),
          http("request_5")
            .get("/web/dist/favicon.ico?v=1721393199309")
            .headers(headers_1),
          http("request_6")
            .get("/web/index.php/core/i18n/messages")
            .headers(headers_6),
          http("request_7")
            .get("/web/images/ohrm_branding.png?v=1721393199309")
            .headers(headers_1)
        ),
      pause(8),
      http("request_8")
        .post("/web/index.php/auth/validate")
        .headers(headers_8)
        .formParam("_token", "e06855541fdb5cbf5e.UQGJyLwF7xmZC0CzVm5wlRvpRzNbovB3tixiHUgav0k.P2Kxo-NShHPbQArRLg8mxH_bD0Nrl5w08ksYfgljjREQN-2k5UyJVO89CQ")
        .formParam("username", "Admin")
        .formParam("password", "admin123")
        .resources(
          http("request_9")
            .get("/web/index.php/core/i18n/messages")
            .headers(headers_6),
          http("request_10")
            .get("/web/images/orange.png?v=1721393199309")
            .headers(headers_1),
          http("request_11")
            .get("/web/images/orangehrm-logo.png?v=1721393199309")
            .headers(headers_1),
          http("request_12")
            .get("/web/index.php/pim/viewPhoto/empNumber/7")
            .headers(headers_12),
          http("request_13")
            .post("/web/index.php/events/push")
            .headers(headers_13),
          http("request_14")
            .get("/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
            .headers(headers_14),
          http("request_15")
            .get("/web/index.php/api/v2/dashboard/employees/action-summary")
            .headers(headers_15),
          http("request_16")
            .get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=3&currentDate=2025-07-09&currentTime=14:40")
            .headers(headers_15),
          http("request_17")
            .get("/web/index.php/api/v2/dashboard/shortcuts")
            .headers(headers_15),
          http("request_18")
            .get("/web/index.php/api/v2/dashboard/employees/leaves?date=2025-07-09")
            .headers(headers_15),
          http("request_19")
            .get("/web/index.php/api/v2/dashboard/employees/subunit")
            .headers(headers_15),
          http("request_20")
            .get("/web/index.php/api/v2/dashboard/employees/locations")
            .headers(headers_15)
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
