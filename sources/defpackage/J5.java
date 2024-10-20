package defpackage;

import android.app.Activity;
import java.util.HashSet;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J5 implements InterfaceC11179wj {
    public static final HashSet h = new HashSet();
    public final K5 a = new K5();
    public final InterfaceC2271Rm1 g;

    public J5(InterfaceC2271Rm1 interfaceC2271Rm1) {
        this.g = interfaceC2271Rm1;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        Object obj = ThreadUtils.a;
        HashSet hashSet = h;
        if (i != 1 && i != 3) {
            if (i == 6) {
                hashSet.remove(Integer.valueOf(activity.hashCode()));
            }
        } else {
            Integer valueOf = Integer.valueOf(activity.hashCode());
            if (hashSet.contains(valueOf)) {
                return;
            }
            hashSet.add(valueOf);
            this.g.a(activity);
        }
    }
}
