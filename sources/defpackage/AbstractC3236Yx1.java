package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yx1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3236Yx1 {
    public static View a(int i, Context context, FrameLayout frameLayout) {
        boolean z = frameLayout != null;
        LayoutInflater from = LayoutInflater.from(context);
        C7432ln3 c = C7432ln3.c();
        try {
            View inflate = from.inflate(i, frameLayout, z);
            c.close();
            return inflate;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
