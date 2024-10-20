package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350Cs extends DS0 implements InterfaceC7625mM0, InterfaceC2438St3 {
    public final FileOutputStream a;
    public final File g;

    public C0350Cs(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.g = file;
    }

    @Override // defpackage.InterfaceC7625mM0
    public final File toFile() {
        return this.g;
    }
}
