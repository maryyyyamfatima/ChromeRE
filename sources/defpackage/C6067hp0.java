package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6067hp0 extends AbstractC6410ip0 {
    @Override // defpackage.AbstractC6410ip0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.AbstractC6410ip0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.AbstractC6410ip0
    public final boolean c(EnumC9447rg0 enumC9447rg0) {
        return enumC9447rg0 == EnumC9447rg0.REMOTE;
    }

    @Override // defpackage.AbstractC6410ip0
    public final boolean d(boolean z, EnumC9447rg0 enumC9447rg0, GA0 ga0) {
        return ((z && enumC9447rg0 == EnumC9447rg0.DATA_DISK_CACHE) || enumC9447rg0 == EnumC9447rg0.LOCAL) && ga0 == GA0.TRANSFORMED;
    }
}
