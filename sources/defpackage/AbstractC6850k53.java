package defpackage;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k53, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6850k53 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC7882n53.b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }
}
