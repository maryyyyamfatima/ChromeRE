package defpackage;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5785h extends AbstractC9095qe2 {
    public static final C5785h a = new C5785h();

    @Override // defpackage.AbstractC9095qe2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.AbstractC9095qe2
    public final Object d(Object obj) {
        return obj;
    }

    @Override // defpackage.AbstractC9095qe2
    public final Object e() {
        return null;
    }

    @Override // defpackage.AbstractC9095qe2
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.AbstractC9095qe2
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.AbstractC9095qe2
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
