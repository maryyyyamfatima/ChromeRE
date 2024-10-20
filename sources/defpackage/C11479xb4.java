package defpackage;

import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.Tutorial;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xb4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C11479xb4 implements Callback {
    public final /* synthetic */ Tutorial a;
    public final /* synthetic */ Callback g;

    public /* synthetic */ C11479xb4(Tutorial tutorial, Callback callback) {
        this.a = tutorial;
        this.g = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        List list = (List) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            if (((Tutorial) list.get(i2)).a == this.a.a) {
                i = i2;
                break;
            }
            i2++;
        }
        this.g.onResult(i < list.size() + (-1) ? (Tutorial) list.get(i + 1) : null);
    }
}
