package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedMetadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jm4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6739jm4 implements Callback {
    public final /* synthetic */ C7771mm4 a;
    public final /* synthetic */ C7427lm4 g;

    public /* synthetic */ C6739jm4(C7771mm4 c7771mm4, C7427lm4 c7427lm4) {
        this.a = c7771mm4;
        this.g = c7427lm4;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        byte[] bArr;
        WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata = (WebFeedBridge$WebFeedMetadata) obj;
        C7771mm4 c7771mm4 = this.a;
        c7771mm4.getClass();
        C7427lm4 c7427lm4 = this.g;
        if (webFeedBridge$WebFeedMetadata != null && (bArr = webFeedBridge$WebFeedMetadata.a) != null && bArr.length > 0 && webFeedBridge$WebFeedMetadata.f && webFeedBridge$WebFeedMetadata.d == 2) {
            C8115nm4 c8115nm4 = new C8115nm4();
            c8115nm4.a = bArr;
            c8115nm4.c = webFeedBridge$WebFeedMetadata.b;
            c8115nm4.b = c7427lm4.b;
            c7771mm4.b(c7427lm4, c8115nm4);
            return;
        }
        if (webFeedBridge$WebFeedMetadata != null) {
            AbstractC4851eH1.d("WFFollowIntroCtrl", "No intro: Web Feed exists, but not suitable. recommended=%s status=%s", Boolean.valueOf(webFeedBridge$WebFeedMetadata.f), Integer.valueOf(webFeedBridge$WebFeedMetadata.d));
        } else {
            AbstractC4851eH1.d("WFFollowIntroCtrl", "No intro: No web feed metadata found", new Object[0]);
        }
        c7771mm4.b(c7427lm4, null);
    }
}
