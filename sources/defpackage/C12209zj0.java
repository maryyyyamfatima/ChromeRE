package defpackage;

import android.util.Log;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12209zj0 implements YC0 {
    @Override // defpackage.YC0
    public final void b(EnumC11375xH1 enumC11375xH1, String str, String str2) {
        d(enumC11375xH1, str, str2, null);
    }

    @Override // defpackage.YC0
    public final void a(String str, NullPointerException nullPointerException) {
        d(EnumC11375xH1.ERROR, "LITHO:NPE:UNSET_PADDING", str, nullPointerException);
    }

    public final void d(EnumC11375xH1 enumC11375xH1, String str, String str2, NullPointerException nullPointerException) {
        int ordinal = enumC11375xH1.ordinal();
        if (ordinal == 0) {
            Log.w("RenderCore:" + str, str2, nullPointerException);
        } else if (ordinal == 1) {
            Log.e("RenderCore:" + str, str2, nullPointerException);
        } else {
            if (ordinal != 2) {
                return;
            }
            Log.e("RenderCore:" + str, str2, nullPointerException);
            throw new RuntimeException(str2);
        }
    }

    @Override // defpackage.YC0
    public final void c(EnumC11375xH1 enumC11375xH1, String str, String str2, Map map) {
        d(enumC11375xH1, str, str2, null);
    }
}
