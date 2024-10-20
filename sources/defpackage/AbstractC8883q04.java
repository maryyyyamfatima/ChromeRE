package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8883q04 {
    public static final C7770mm3 a = new C7770mm3();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:            if ((r10 & 128) == 0) goto L23;     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8883q04.a(android.content.Context):void");
    }

    public static void b(Context context, AlertDialog alertDialog) {
        alertDialog.getWindow().setFlags(8, 8);
        alertDialog.show();
        Activity a2 = U60.a(context);
        if (a2 != null) {
            alertDialog.getWindow().getDecorView().setSystemUiVisibility(a2.getWindow().getDecorView().getSystemUiVisibility());
        }
        alertDialog.getWindow().clearFlags(8);
    }
}
