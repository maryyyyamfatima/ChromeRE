package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11599xv4 implements Rv4 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ xw4 b;
    public final /* synthetic */ C5081ew4 c;

    public C11599xv4(C5081ew4 c5081ew4, HashSet hashSet, xw4 xw4Var) {
        this.c = c5081ew4;
        this.a = hashSet;
        this.b = xw4Var;
    }

    @Override // defpackage.Rv4
    public final void a(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        xw4 xw4Var = this.b;
        this.c.c(xw4Var, hashSet, new Fv4(hashSet2, xw4Var, zipFile));
        this.a.addAll(hashSet2);
    }
}
