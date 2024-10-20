package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uv */
/* loaded from: classes.dex */
public abstract class AbstractC2704Uv implements InterfaceC7976nN2 {
    public Map a;
    public Map b = null;

    @Override // defpackage.InterfaceC7976nN2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC7976nN2
    public C5524gE1 d() {
        return null;
    }

    @Override // defpackage.InterfaceC7976nN2
    public boolean g() {
        return this instanceof C9328rJ2;
    }

    @Override // defpackage.InterfaceC7976nN2
    public final void h() {
    }

    @Override // defpackage.InterfaceC7976nN2
    public String o() {
        return null;
    }

    public AbstractC2704Uv(AbstractC2574Tv abstractC2574Tv) {
        this.a = abstractC2574Tv.a;
    }

    @Override // defpackage.InterfaceC7976nN2
    public final boolean p() {
        Map map = this.a;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) this.a.get("is_sticky")).booleanValue();
    }

    @Override // defpackage.InterfaceC7976nN2
    public final int e() {
        Map map = this.a;
        if (map == null || !map.containsKey("span_size")) {
            return 1;
        }
        return ((Integer) this.a.get("span_size")).intValue();
    }

    @Override // defpackage.InterfaceC7976nN2
    public final boolean q() {
        Map map = this.a;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) this.a.get("is_full_span")).booleanValue();
    }

    @Override // defpackage.InterfaceC7976nN2
    public final Object l(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // defpackage.InterfaceC7976nN2
    public WZ j() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC7976nN2
    public C6206iD0 a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC7976nN2
    public final void i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC7976nN2
    public final void n() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC7976nN2
    public final int f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC7976nN2
    public final void m(String str) {
        if (this.b == null) {
            this.b = Collections.synchronizedMap(new HashMap());
        }
        this.b.put("section_global_key", str);
    }

    @Override // defpackage.InterfaceC7976nN2
    public final void k(int i) {
        throw new UnsupportedOperationException();
    }
}
