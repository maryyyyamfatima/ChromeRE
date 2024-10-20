package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2644Uj extends AbstractC2774Vj {
    public final transient int j;

    public C2644Uj() {
        super(new OY(12));
        RV.b(3, "expectedValuesPerKey");
        this.j = 3;
    }

    @Override // defpackage.X
    public final Collection c() {
        return new ArrayList(this.j);
    }
}
