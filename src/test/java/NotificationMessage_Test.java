import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import base.WebLink;
import pages.NotificationMessagePage;

public class NotificationMessage_Test extends BaseTest {
	NotificationMessagePage page = null;

	@Test
	public void validateNotificationMsg() {
		page = new NotificationMessagePage(driver);
		try {
			driver.get(WebLink.notificationPageUrl);
			Assert.assertEquals(page.verifyNotificationMsg(), true);
		} catch (Exception e) {
			Assert.assertTrue(false);
			e.getLocalizedMessage();
		}
	}

}
