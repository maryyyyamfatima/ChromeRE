package org.chromium.chrome.browser.ui.android.webid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractC7184l4;
import defpackage.C0037Ah1;
import defpackage.C4091c4;
import defpackage.N3;
import defpackage.QB;
import defpackage.S3;
import defpackage.UB;
import defpackage.V60;
import java.util.Arrays;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionBridge;
import org.chromium.chrome.browser.ui.android.webid.data.Account;
import org.chromium.chrome.browser.ui.android.webid.data.ClientIdMetadata;
import org.chromium.chrome.browser.ui.android.webid.data.IdentityProviderMetadata;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AccountSelectionBridge implements N3 {
    public long a;
    public final S3 b;

    public AccountSelectionBridge(long j, WindowAndroid windowAndroid, QB qb) {
        this.a = j;
        this.b = new S3((Context) windowAndroid.j.get(), qb, this);
    }

    public static AccountSelectionBridge create(long j, WindowAndroid windowAndroid) {
        QB a = UB.a(windowAndroid);
        if (a == null) {
            return null;
        }
        return new AccountSelectionBridge(j, windowAndroid, a);
    }

    public static int getBrandIconIdealSize() {
        return Math.round(V60.a.getResources().getDimension(R.dimen.f28020_resource_name_obfuscated_res_0x7f08005c) / 0.8f);
    }

    public static int getBrandIconMinimumSize() {
        return Math.round(getBrandIconIdealSize() / Math.max(V60.a.getResources().getDisplayMetrics().density, 1.0f));
    }

    public final void showAccounts(String str, String str2, Account[] accountArr, IdentityProviderMetadata identityProviderMetadata, ClientIdMetadata clientIdMetadata, boolean z) {
        List asList = Arrays.asList(accountArr);
        final C4091c4 c4091c4 = this.b.a;
        c4091c4.getClass();
        if (!TextUtils.isEmpty(identityProviderMetadata.c)) {
            c4091c4.p = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            new Canvas(c4091c4.p).drawColor(0);
        }
        c4091c4.s = asList.size() == 1 ? (Account) asList.get(0) : null;
        c4091c4.d(str, str2, asList, identityProviderMetadata, clientIdMetadata, z, AbstractC7184l4.d);
        String str3 = identityProviderMetadata.c;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        int brandIconIdealSize = getBrandIconIdealSize();
        c4091c4.f.d(new C0037Ah1(brandIconIdealSize, brandIconIdealSize, 0, new GURL(str3).i(), "WebIDAccountSelection", false), new Callback() { // from class: T3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C4091c4 c4091c42 = C4091c4.this;
                c4091c42.getClass();
                if (bitmap == null || bitmap.getWidth() != bitmap.getHeight() || bitmap.getWidth() < AccountSelectionBridge.getBrandIconMinimumSize()) {
                    return;
                }
                c4091c42.p = bitmap;
                c4091c42.f();
            }
        });
    }

    public final void destroy() {
        C4091c4 c4091c4 = this.b.a;
        if (!c4091c4.b) {
            c4091c4.a();
        }
        this.a = 0L;
    }
}
