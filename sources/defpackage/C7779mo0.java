package defpackage;

import com.google.android.libraries.elements.converters.directupdate.DirectUpdateExecutorImpl;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DirectUpdateProcessor;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mo0 */
/* loaded from: classes.dex */
public final class C7779mo0 implements InterfaceC9298rD2 {
    public final InterfaceC9989tE2 a;

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
        throw null;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = (DirectUpdatePropertiesOuterClass$DirectUpdateProperties) obj;
        ByteStore byteStore = (ByteStore) ((AbstractC9095qe2) this.a.get()).e();
        if (byteStore == null) {
            throw new C10239ty0("ByteStore is not provided");
        }
        Map u = interfaceC8177nx0.u();
        EnumC8123no0 enumC8123no0 = EnumC8123no0.h;
        C10223tv0 c10223tv0 = (C10223tv0) u.get(enumC8123no0);
        if (c10223tv0 == null || !(c10223tv0.a instanceof Float)) {
            C10223tv0 c10223tv02 = new C10223tv0(Float.valueOf(1.0f));
            interfaceC8177nx0.m(enumC8123no0, c10223tv02);
            TZ l = interfaceC8177nx0.l();
            l.h.a0().put(1, c10223tv02);
            l.k();
        } else {
            TZ l2 = interfaceC8177nx0.l();
            l2.h.a0().put(1, c10223tv0);
            l2.k();
        }
        EnumC8123no0 enumC8123no02 = EnumC8123no0.l;
        C10223tv0 c10223tv03 = (C10223tv0) u.get(enumC8123no02);
        if (c10223tv03 == null || !(c10223tv03.a instanceof Float)) {
            C10223tv0 c10223tv04 = new C10223tv0(Float.valueOf(0.0f));
            interfaceC8177nx0.m(enumC8123no02, c10223tv04);
            TZ l3 = interfaceC8177nx0.l();
            l3.h.a0().put(8, c10223tv04);
            l3.k();
        } else {
            TZ l4 = interfaceC8177nx0.l();
            l4.h.a0().put(8, c10223tv03);
            l4.k();
        }
        EnumC8123no0 enumC8123no03 = EnumC8123no0.k;
        C10223tv0 c10223tv05 = (C10223tv0) u.get(enumC8123no03);
        if (c10223tv05 == null || !(c10223tv05.a instanceof Float)) {
            C10223tv0 c10223tv06 = new C10223tv0(Float.valueOf(1.0f));
            interfaceC8177nx0.m(enumC8123no03, c10223tv06);
            TZ l5 = interfaceC8177nx0.l();
            l5.h.a0().put(4, c10223tv06);
            l5.k();
            TZ l6 = interfaceC8177nx0.l();
            l6.h.a0().put(5, c10223tv06);
            l6.k();
        } else {
            TZ l7 = interfaceC8177nx0.l();
            l7.h.a0().put(4, c10223tv05);
            l7.k();
            TZ l8 = interfaceC8177nx0.l();
            l8.h.a0().put(5, c10223tv05);
            l8.k();
        }
        EnumC8123no0 enumC8123no04 = EnumC8123no0.i;
        C10223tv0 c10223tv07 = (C10223tv0) u.get(enumC8123no04);
        if (c10223tv07 == null || !(c10223tv07.a instanceof Float)) {
            C10223tv0 c10223tv08 = new C10223tv0(Float.valueOf(0.0f));
            interfaceC8177nx0.m(enumC8123no04, c10223tv08);
            TZ l9 = interfaceC8177nx0.l();
            l9.h.a0().put(2, c10223tv08);
            l9.k();
        } else {
            TZ l10 = interfaceC8177nx0.l();
            l10.h.a0().put(2, c10223tv07);
            l10.k();
        }
        EnumC8123no0 enumC8123no05 = EnumC8123no0.j;
        C10223tv0 c10223tv09 = (C10223tv0) u.get(enumC8123no05);
        if (c10223tv09 == null || !(c10223tv09.a instanceof Float)) {
            C10223tv0 c10223tv010 = new C10223tv0(Float.valueOf(0.0f));
            interfaceC8177nx0.m(enumC8123no05, c10223tv010);
            TZ l11 = interfaceC8177nx0.l();
            l11.h.a0().put(3, c10223tv010);
            l11.k();
        } else {
            TZ l12 = interfaceC8177nx0.l();
            l12.h.a0().put(3, c10223tv09);
            l12.k();
        }
        DirectUpdateProcessor create = DirectUpdateProcessor.create(new DirectUpdateExecutorImpl(interfaceC8177nx0.u(), c7849n00.f().getDisplayMetrics()), byteStore, null);
        if (create == null) {
            throw new C10239ty0("Error creating DirectUpdateProcessor");
        }
        InterfaceC7103kq0 interfaceC7103kq0 = ((C3184Yn) u80).f;
        if (interfaceC7103kq0 != null) {
            interfaceC7103kq0.a(new C7435lo0(create));
        }
        create.processProperties(directUpdatePropertiesOuterClass$DirectUpdateProperties);
    }

    public C7779mo0(C0806Gf0 c0806Gf0) {
        this.a = c0806Gf0;
    }

    @Override // defpackage.InterfaceC9298rD2
    public final OX0 a() {
        return DirectUpdatePropertiesOuterClass$DirectUpdateProperties.m;
    }
}
