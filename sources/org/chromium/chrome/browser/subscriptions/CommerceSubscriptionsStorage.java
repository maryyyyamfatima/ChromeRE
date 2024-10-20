package org.chromium.chrome.browser.subscriptions;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CommerceSubscriptionsStorage {
    public long a;

    public CommerceSubscriptionsStorage(Profile profile) {
        N.MUGgS4s5(this, profile);
    }

    public final void setNativePtr(long j) {
        this.a = j;
    }

    public static String a(CommerceSubscription commerceSubscription) {
        return String.format("%s_%s_%s", commerceSubscription.b, commerceSubscription.e, commerceSubscription.c);
    }
}
