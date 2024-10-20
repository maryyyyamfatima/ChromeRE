package defpackage;

import android.os.Build;
import android.view.Window;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wE3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11019wE3 {
    public final TD3 a;

    public C11019wE3(Window window, InterfaceC10590uz3 interfaceC10590uz3, C8385oa2 c8385oa2, ZU0 zu0) {
        if (Build.VERSION.SDK_INT >= 27) {
            this.a = new TD3(window, interfaceC10590uz3, c8385oa2, zu0);
        }
    }
}
