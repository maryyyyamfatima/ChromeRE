package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XR1 implements InterfaceC3145Yf0 {
    public static final String[] h = {"_data"};
    public final Context a;
    public final Uri g;

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public XR1(Context context, Uri uri) {
        this.a = context;
        this.g = uri;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        Cursor query = this.a.getContentResolver().query(this.g, h, null, null, null);
        if (query != null) {
            try {
                r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(r0)) {
            interfaceC3015Xf0.d(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(this.g))));
        } else {
            interfaceC3015Xf0.f(new File(r0));
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}
