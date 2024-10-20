package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10022tL0 implements InterfaceC12080zL0 {
    public final String a;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    public C10022tL0(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        String str = this.a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AbstractC9048qW.c(Pair.create("Feedback Context", str));
    }
}
