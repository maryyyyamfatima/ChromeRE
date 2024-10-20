package defpackage;

import android.app.Activity;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.history_clusters.f;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ec2 */
/* loaded from: classes.dex */
public final class C4959ec2 implements InterfaceC4272cc2 {
    public final Activity a;
    public f b;
    public final InterfaceC7697ma2 c;

    public C4959ec2(Activity activity, C0538Ed2 c0538Ed2, C8385oa2 c8385oa2) {
        this.a = activity;
        c0538Ed2.j(new Callback() { // from class: dc2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4959ec2.this.b = (f) obj;
            }
        });
        this.c = c8385oa2;
    }
}
