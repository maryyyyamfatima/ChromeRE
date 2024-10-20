package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ts1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2561Ts1 implements Iterator, j$.util.Iterator {
    public static final EnumC2561Ts1 a;
    public static final /* synthetic */ EnumC2561Ts1[] g;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
    }

    public static EnumC2561Ts1[] values() {
        return (EnumC2561Ts1[]) g.clone();
    }

    static {
        EnumC2561Ts1 enumC2561Ts1 = new EnumC2561Ts1();
        a = enumC2561Ts1;
        g = new EnumC2561Ts1[]{enumC2561Ts1};
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }
}
