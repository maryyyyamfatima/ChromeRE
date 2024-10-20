package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8706pW0 implements InterfaceC10077tW0 {
    @Override // defpackage.InterfaceC10077tW0
    public final String[] a(Object obj) {
        return ((Bundle) obj).getStringArray("data");
    }

    @Override // defpackage.InterfaceC10077tW0
    public final String b(Object obj, String str) {
        return ((Bundle) obj).getString(str);
    }

    @Override // defpackage.InterfaceC10077tW0
    public final boolean c(Object obj, String str) {
        return ((Bundle) obj).containsKey(str);
    }
}
