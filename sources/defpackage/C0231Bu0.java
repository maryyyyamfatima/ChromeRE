package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0231Bu0 {
    public final InterfaceC0751Fu0 a;

    public C0231Bu0(Context context, View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a = new C0621Eu0(context, view);
        } else {
            this.a = new C1141Iu0(context, view);
        }
    }
}
