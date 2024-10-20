package defpackage;

import android.util.LruCache;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10381uO1 extends LruCache {
    public final /* synthetic */ C11067wO1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10381uO1(C11067wO1 c11067wO1) {
        super(20);
        this.a = c11067wO1;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            this.a.g.add(num);
        }
    }
}
