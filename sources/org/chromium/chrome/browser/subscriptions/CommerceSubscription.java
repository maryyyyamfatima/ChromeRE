package org.chromium.chrome.browser.subscriptions;

import defpackage.C5278fY;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CommerceSubscription {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final C5278fY f;

    public CommerceSubscription(String str, String str2, String str3) {
        this("PRICE_TRACK", str, str2, str3, -1L);
    }

    public CommerceSubscription(String str, String str2, String str3, String str4, long j) {
        this(str, str2, str3, str4, j, null);
    }

    public CommerceSubscription(String str, String str2, String str3, String str4, long j, C5278fY c5278fY) {
        this.c = str2;
        this.b = str;
        this.d = str3;
        this.e = str4;
        this.a = j;
        this.f = c5278fY;
    }

    public static List createSubscriptionList() {
        return new ArrayList();
    }

    public static CommerceSubscription createSubscriptionAndAddToList(List list, String str, String str2, String str3, String str4, long j) {
        CommerceSubscription commerceSubscription = new CommerceSubscription(str, str2, str3, str4, j);
        list.add(commerceSubscription);
        return commerceSubscription;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CommerceSubscription)) {
            return false;
        }
        CommerceSubscription commerceSubscription = (CommerceSubscription) obj;
        return this.d.equals(commerceSubscription.d) && this.b.equals(commerceSubscription.b) && this.c.equals(commerceSubscription.c) && this.e.equals(commerceSubscription.e) && this.a == commerceSubscription.a;
    }
}
