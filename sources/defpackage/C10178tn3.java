package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10178tn3 implements InterfaceC8030nY1 {
    public final InterfaceC8030nY1 a;

    @Override // defpackage.InterfaceC8030nY1
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        Uri fromFile;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            fromFile = null;
        } else if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        } else {
            fromFile = Uri.fromFile(new File(str));
        }
        if (fromFile == null) {
            return null;
        }
        InterfaceC8030nY1 interfaceC8030nY1 = this.a;
        if (interfaceC8030nY1.a(fromFile)) {
            return interfaceC8030nY1.b(fromFile, i, i2, c0543Ee2);
        }
        return null;
    }

    public C10178tn3(InterfaceC8030nY1 interfaceC8030nY1) {
        this.a = interfaceC8030nY1;
    }
}
