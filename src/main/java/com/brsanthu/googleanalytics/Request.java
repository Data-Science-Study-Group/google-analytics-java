package com.brsanthu.googleanalytics;

import static com.brsanthu.googleanalytics.Parameter.CURRENCY_CODE;
import static com.brsanthu.googleanalytics.Parameter.DNS_TIME;
import static com.brsanthu.googleanalytics.Parameter.EVENT_ACTION;
import static com.brsanthu.googleanalytics.Parameter.EVENT_CATEGORY;
import static com.brsanthu.googleanalytics.Parameter.EVENT_LABEL;
import static com.brsanthu.googleanalytics.Parameter.EVENT_VALUE;
import static com.brsanthu.googleanalytics.Parameter.EXCEPTION_DESCRIPTION;
import static com.brsanthu.googleanalytics.Parameter.EXCEPTION_FATAL;
import static com.brsanthu.googleanalytics.Parameter.ITEM_CATEGORY;
import static com.brsanthu.googleanalytics.Parameter.ITEM_CODE;
import static com.brsanthu.googleanalytics.Parameter.ITEM_NAME;
import static com.brsanthu.googleanalytics.Parameter.ITEM_PRICE;
import static com.brsanthu.googleanalytics.Parameter.ITEM_QUANTITY;
import static com.brsanthu.googleanalytics.Parameter.PAGE_DOWNLOAD_TIME;
import static com.brsanthu.googleanalytics.Parameter.PAGE_LOAD_TIME;
import static com.brsanthu.googleanalytics.Parameter.REDIRECT_RESPONSE_TIME;
import static com.brsanthu.googleanalytics.Parameter.SERVER_RESPONSE_TIME;
import static com.brsanthu.googleanalytics.Parameter.SOCIAL_ACTION;
import static com.brsanthu.googleanalytics.Parameter.SOCIAL_ACTION_TARGET;
import static com.brsanthu.googleanalytics.Parameter.SOCIAL_NETWORK;
import static com.brsanthu.googleanalytics.Parameter.TCP_CONNECT_TIME;
import static com.brsanthu.googleanalytics.Parameter.TRANSACTION_AFFILIATION;
import static com.brsanthu.googleanalytics.Parameter.TRANSACTION_ID;
import static com.brsanthu.googleanalytics.Parameter.TRANSACTION_REVENUE;
import static com.brsanthu.googleanalytics.Parameter.TRANSACTION_SHIPPING;
import static com.brsanthu.googleanalytics.Parameter.TRANSACTION_TAX;
import static com.brsanthu.googleanalytics.Parameter.USER_TIMING_CATEGORY;
import static com.brsanthu.googleanalytics.Parameter.USER_TIMING_LABEL;
import static com.brsanthu.googleanalytics.Parameter.USER_TIMING_TIME;
import static com.brsanthu.googleanalytics.Parameter.USER_TIMING_VARIABLE_NAME;

public class Request extends AbstractRequest<Request>{

	public Request() {
		this(null, null, null, null);
	}

	public Request(String hitType) {
		this(hitType, null, null, null);
	}

	public Request(String hitType, String trackingId, String appName, String appVersion) {
		hitType(isEmpty(hitType)?"pageView":hitType);
		trackingId(trackingId);
		applicationName(appName);
		applicationVersion(appVersion);
	}

	/**
	 * <h2 id="events">Event Tracking</h2>
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the event category. Must not be empty.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ec</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>150 Bytes
	 * 				</td>
	 * 				<td>event</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>Category</code><br>
	 * 		Example usage: <code>ec=Category</code>
	 * 	</div>
	 * </div>
	 */
	public Request eventCategory(String value) {
		setString(EVENT_CATEGORY, value);
	   	return this;
	}

	public String eventCategory() {
		return getString(EVENT_CATEGORY);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the event action.  Must not be empty.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ea</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>event</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>Action</code><br>
	 * 		Example usage: <code>ea=Action</code>
	 * 	</div>
	 * </div>
	 */
	public Request eventAction(String value) {
		setString(EVENT_ACTION, value);
	   	return this;
	}
	public String eventAction() {
		return getString(EVENT_ACTION);
	}


	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the event label.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>el</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>event</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>Label</code><br>
	 * 		Example usage: <code>el=Label</code>
	 * 	</div>
	 * </div>
	 */
	public Request eventLabel(String value) {
		setString(EVENT_LABEL, value);
	   	return this;
	}
	public String eventLabel() {
		return getString(EVENT_LABEL);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the event value. Values must be non-negative.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ev</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>event</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>55</code><br>
	 * 		Example usage: <code>ev=55</code>
	 * 	</div>
	 * </div>
	 */
	public Request eventValue(Integer value) {
		setInteger(EVENT_VALUE, value);
	   	return this;
	}
	public Integer eventValue() {
		return getInteger(EVENT_VALUE);
	}


	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the description of an exception.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>exd</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>150 Bytes
	 * 				</td>
	 * 				<td>exception</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>DatabaseError</code><br>
	 * 		Example usage: <code>exd=DatabaseError</code>
	 * 	</div>
	 * </div>
	 */
	public Request exceptionDescription(String value) {
		setString(EXCEPTION_DESCRIPTION, value);
	   	return this;
	}
	public String exceptionDescription() {
		return getString(EXCEPTION_DESCRIPTION);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies whether the exception was fatal.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>exf</code></td>
	 * 				<td>boolean</td>
	 * 				<td><code>1</code>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>exception</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>0</code><br>
	 * 		Example usage: <code>exf=0</code>
	 * 	</div>
	 * </div>
	 */
	public Request exceptionFatal(Boolean value) {
		setBoolean(EXCEPTION_FATAL, value);
	   	return this;
	}
	public Boolean exceptionFatal() {
		return getBoolean(EXCEPTION_FATAL);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for item hit type.</strong>
	 * 	</p>
	 * 	<p>Specifies the item name.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>in</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>item</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>Shoe</code><br>
	 * 		Example usage: <code>in=Shoe</code>
	 * 	</div>
	 * </div>
	 */
	public Request itemName(String value) {
		setString(ITEM_NAME, value);
	   	return this;
	}
	public String itemName() {
		return getString(ITEM_NAME);
	}


	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the price for a single item / unit.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ip</code></td>
	 * 				<td>currency</td>
	 * 				<td><code>0</code>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>item</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>3.50</code><br>
	 * 		Example usage: <code>ip=3.50</code>
	 * 	</div>
	 * </div>
	 */
	public Request itemPrice(Double value) {
		setDouble(ITEM_PRICE, value);
	   	return this;
	}
	public Double itemPrice() {
		return getDouble(ITEM_PRICE);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the number of items purchased.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>iq</code></td>
	 * 				<td>integer</td>
	 * 				<td><code>0</code>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>item</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>4</code><br>
	 * 		Example usage: <code>iq=4</code>
	 * 	</div>
	 * </div>
	 */
	public Request itemQuantity(Integer value) {
		setInteger(ITEM_QUANTITY, value);
	   	return this;
	}
	public Integer itemQuantity() {
		return getInteger(ITEM_QUANTITY);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the SKU or item code.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ic</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>item</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>SKU47</code><br>
	 * 		Example usage: <code>ic=SKU47</code>
	 * 	</div>
	 * </div>
	 */
	public Request itemCode(String value) {
		setString(ITEM_CODE, value);
	   	return this;
	}
	public String itemCode() {
		return getString(ITEM_CODE);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the category that the item belongs to.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>iv</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>item</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>Blue</code><br>
	 * 		Example usage: <code>iv=Blue</code>
	 * 	</div>
	 * </div>
	 */
	public Request itemCategory(String value) {
		setString(ITEM_CATEGORY, value);
	   	return this;
	}
	public String itemCategory() {
		return getString(ITEM_CATEGORY);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>When present indicates the local currency for all transaction currency values. Value should be a valid ISO 4217 currency code.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>cu</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>10 Bytes
	 * 				</td>
	 * 				<td>transaction, item</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>EUR</code><br>
	 * 		Example usage: <code>cu=EUR</code>
	 * 	</div>
	 * </div>
	 */
	public Request currencyCode(String value) {
		setString(CURRENCY_CODE, value);
	   	return this;
	}
	public String currencyCode() {
		return getString(CURRENCY_CODE);
	}


	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for social hit type.</strong>
	 * 	</p>
	 * 	<p>Specifies the social network, for example Facebook or Google Plus.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>sn</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>50 Bytes
	 * 				</td>
	 * 				<td>social</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>facebook</code><br>
	 * 		Example usage: <code>sn=facebook</code>
	 * 	</div>
	 * </div>
	 */
	public Request socialNetwork(String value) {
		setString(SOCIAL_NETWORK, value);
	   	return this;
	}
	public String socialNetwork() {
		return getString(SOCIAL_NETWORK);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for social hit type.</strong>
	 * 	</p>
	 * 	<p>Specifies the social interaction action. For example on Google Plus when a user clicks the +1 button, the social action is 'plus'.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>sa</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>50 Bytes
	 * 				</td>
	 * 				<td>social</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>like</code><br>
	 * 		Example usage: <code>sa=like</code>
	 * 	</div>
	 * </div>
	 */
	public Request socialAction(String value) {
		setString(SOCIAL_ACTION, value);
	   	return this;
	}
	public String socialAction() {
		return getString(SOCIAL_ACTION);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for social hit type.</strong>
	 * 	</p>
	 * 	<p>Specifies the target of a social interaction. This value is typically a URL but can be any text.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>st</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>2048 Bytes
	 * 				</td>
	 * 				<td>social</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>http://foo.com</code><br>
	 * 		Example usage: <code>st=http%3A%2F%2Ffoo.com</code>
	 * 	</div>
	 * </div>
	 */
	public Request socialActionTarget(String value) {
		setString(SOCIAL_ACTION_TARGET, value);
	   	return this;
	}
	public String socialActionTarget() {
		return getString(SOCIAL_ACTION_TARGET);
	}


	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the user timing category.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>utc</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>150 Bytes
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>category</code><br>
	 * 		Example usage: <code>utc=category</code>
	 * 	</div>
	 * </div>
	 */
	public Request userTimingCategory(String value) {
		setString(USER_TIMING_CATEGORY, value);
	   	return this;
	}
	public String userTimingCategory() {
		return getString(USER_TIMING_CATEGORY);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the user timing variable.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>utv</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>lookup</code><br>
	 * 		Example usage: <code>utv=lookup</code>
	 * 	</div>
	 * </div>
	 */
	public Request userTimingVariableName(String value) {
		setString(USER_TIMING_VARIABLE_NAME, value);
	   	return this;
	}
	public String userTimingVariableName() {
		return getString(USER_TIMING_VARIABLE_NAME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the user timing value. The value is in milliseconds.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>utt</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>123</code><br>
	 * 		Example usage: <code>utt=123</code>
	 * 	</div>
	 * </div>
	 */
	public Request userTimingTime(Integer value) {
		setInteger(USER_TIMING_TIME, value);
	   	return this;
	}
	public Integer userTimingTime() {
		return getInteger(USER_TIMING_TIME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the user timing label.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>utl</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>label</code><br>
	 * 		Example usage: <code>utl=label</code>
	 * 	</div>
	 * </div>
	 */
	public Request userTimingLabel(String value) {
		setString(USER_TIMING_LABEL, value);
	   	return this;
	}
	public String userTimingLabel() {
		return getString(USER_TIMING_LABEL);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the time it took for a page to load. The value is in milliseconds.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>plt</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>3554</code><br>
	 * 		Example usage: <code>plt=3554</code>
	 * 	</div>
	 * </div>
	 */
	public Request pageLoadTime(Integer value) {
		setInteger(PAGE_LOAD_TIME, value);
	   	return this;
	}
	public Integer pageLoadTime() {
		return getInteger(PAGE_LOAD_TIME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the time it took to do a DNS lookup.The value is in milliseconds.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>dns</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>43</code><br>
	 * 		Example usage: <code>dns=43</code>
	 * 	</div>
	 * </div>
	 */
	public Request dnsTime(Integer value) {
		setInteger(DNS_TIME, value);
	   	return this;
	}
	public Integer dnsTime() {
		return getInteger(DNS_TIME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the time it took for the page to be downloaded. The value is in milliseconds.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>pdt</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>500</code><br>
	 * 		Example usage: <code>pdt=500</code>
	 * 	</div>
	 * </div>
	 */
	public Request pageDownloadTime(Integer value) {
		setInteger(PAGE_DOWNLOAD_TIME, value);
	   	return this;
	}
	public Integer pageDownloadTime() {
		return getInteger(PAGE_DOWNLOAD_TIME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the time it took for any redirects to happen. The value is in milliseconds.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>rrt</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>500</code><br>
	 * 		Example usage: <code>rrt=500</code>
	 * 	</div>
	 * </div>
	 */
	public Request redirectResponseTime(Integer value) {
		setInteger(REDIRECT_RESPONSE_TIME, value);
	   	return this;
	}
	public Integer redirectResponseTime() {
		return getInteger(REDIRECT_RESPONSE_TIME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the time it took for a TCP connection to be made. The value is in milliseconds.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>tcp</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>500</code><br>
	 * 		Example usage: <code>tcp=500</code>
	 * 	</div>
	 * </div>
	 */
	public Request tcpConnectTime(Integer value) {
		setInteger(TCP_CONNECT_TIME, value);
	   	return this;
	}
	public Integer tcpConnectTime() {
		return getInteger(TCP_CONNECT_TIME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the time it took for the server to respond after the connect time. The value is in milliseconds.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>srt</code></td>
	 * 				<td>integer</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>timing</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>500</code><br>
	 * 		Example usage: <code>srt=500</code>
	 * 	</div>
	 * </div>
	 */
	public Request serverResponseTime(Integer value) {
		setInteger(SERVER_RESPONSE_TIME, value);
	   	return this;
	}
	public Integer serverResponseTime() {
		return getInteger(SERVER_RESPONSE_TIME);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for transaction hit type.</strong>
	 * 		<br>
	 * 		<strong>Required for item hit type.</strong>
	 * 	</p>
	 * 	<p>A unique identifier for the transaction. This value should be the same for both the Transaction hit and Items hits associated to the particular transaction.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ti</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>transaction, item</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>OD564</code><br>
	 * 		Example usage: <code>ti=OD564</code>
	 * 	</div>
	 * </div>
	 */
	public Request txId(String value) {
		setString(TRANSACTION_ID, value);
	   	return this;
	}
	public String txId() {
		return getString(TRANSACTION_ID);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the affiliation or store name.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ta</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>500 Bytes
	 * 				</td>
	 * 				<td>transaction</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>Member</code><br>
	 * 		Example usage: <code>ta=Member</code>
	 * 	</div>
	 * </div>
	 */
	public Request txAffiliation(String value) {
		setString(TRANSACTION_AFFILIATION, value);
	   	return this;
	}
	public String txAffiliation() {
		return getString(TRANSACTION_AFFILIATION);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the total revenue associated with the transaction. This value should include any shipping or tax costs.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>tr</code></td>
	 * 				<td>currency</td>
	 * 				<td><code>0</code>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>transaction</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>15.47</code><br>
	 * 		Example usage: <code>tr=15.47</code>
	 * 	</div>
	 * </div>
	 */
	public Request txRevenue(Double value) {
		setDouble(TRANSACTION_REVENUE, value);
	   	return this;
	}

	public Double txRevenue() {
		return getDouble(TRANSACTION_REVENUE);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the total shipping cost of the transaction.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>ts</code></td>
	 * 				<td>currency</td>
	 * 				<td><code>0</code>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>transaction</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>3.50</code><br>
	 * 		Example usage: <code>ts=3.50</code>
	 * 	</div>
	 * </div>
	 */
	public Request txShipping(Double value) {
		setDouble(TRANSACTION_SHIPPING, value);
	   	return this;
	}
	public Double txShipping() {
		return getDouble(TRANSACTION_SHIPPING);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		Optional.
	 * 	</p>
	 * 	<p>Specifies the total tax of the transaction.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>tt</code></td>
	 * 				<td>currency</td>
	 * 				<td><code>0</code>
	 * 				</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>transaction</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>11.20</code><br>
	 * 		Example usage: <code>tt=11.20</code>
	 * 	</div>
	 * </div>
	 */
	public Request txTax(Double value) {
		setDouble(TRANSACTION_TAX, value);
	   	return this;
	}
	public Double txTax() {
		return getDouble(TRANSACTION_TAX);
	}
}
