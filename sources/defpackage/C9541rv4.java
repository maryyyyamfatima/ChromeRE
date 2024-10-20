package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9541rv4 implements Rv4 {
    public final /* synthetic */ xw4 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ C5081ew4 d;

    public C9541rv4(C5081ew4 c5081ew4, xw4 xw4Var, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.d = c5081ew4;
        this.a = xw4Var;
        this.b = hashSet;
        this.c = atomicBoolean;
    }

    @Override // defpackage.Rv4
    public final void a(ZipFile zipFile, HashSet hashSet) {
        this.d.c(this.a, hashSet, new C7137kv4(this));
    }
}
