package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.commerce.core.ShoppingService;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5260fU1 {
    public final void a(final Callback callback, Profile profile, GURL gurl) {
        if (profile == null || profile.i()) {
            callback.onResult(null);
            return;
        }
        ShoppingService shoppingService = (ShoppingService) N.M6mAHnyc(profile);
        ShoppingService.MerchantInfoCallback merchantInfoCallback = new ShoppingService.MerchantInfoCallback() { // from class: eU1
            @Override // org.chromium.components.commerce.core.ShoppingService.MerchantInfoCallback
            public final void a(ShoppingService.MerchantInfo merchantInfo) {
                C5260fU1.this.getClass();
                if (!((merchantInfo == null || merchantInfo.c == null || merchantInfo.f || (merchantInfo.a <= 0.0f && !merchantInfo.d)) ? false : true)) {
                    merchantInfo = null;
                }
                callback.onResult(merchantInfo);
            }
        };
        long j = shoppingService.a;
        if (j == 0) {
            return;
        }
        N.M0walDwl(j, shoppingService, gurl, merchantInfoCallback);
    }
}
