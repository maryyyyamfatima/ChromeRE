package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.permissions.nfc.NfcSystemLevelSetting;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e42 */
/* loaded from: classes2.dex */
public final class C4781e42 extends C7034ke3 {
    public C4781e42(Profile profile) {
        super(13, "", profile);
    }

    @Override // defpackage.C7034ke3
    public final boolean p() {
        return NfcSystemLevelSetting.isNfcAccessPossible();
    }

    @Override // defpackage.C7034ke3
    public final String j(Context context) {
        return context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1401e7);
    }

    @Override // defpackage.C7034ke3
    public final boolean e() {
        return NfcSystemLevelSetting.isNfcSystemLevelSettingEnabled();
    }

    @Override // defpackage.C7034ke3
    public final String i(Context context) {
        return context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1401e6);
    }

    @Override // defpackage.C7034ke3
    public final Intent h() {
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        if (intent.resolveActivity(V60.a.getPackageManager()) == null) {
            return null;
        }
        return intent;
    }
}
