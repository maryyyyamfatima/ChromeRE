package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220Bs extends AbstractC10400uS0 implements InterfaceC7625mM0 {
    public final File a;

    public C0220Bs(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = file;
    }

    @Override // defpackage.InterfaceC7625mM0
    public final File toFile() {
        return this.a;
    }
}
