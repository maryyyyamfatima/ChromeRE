package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.AdapterView;
import com.android.chrome.R;
import org.chromium.chrome.browser.download.dialogs.DownloadLocationCustomView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vr0 */
/* loaded from: classes.dex */
public final class C2815Vr0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ DownloadLocationCustomView a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DownloadLocationCustomView downloadLocationCustomView = this.a;
        long j2 = ((C0461Do0) downloadLocationCustomView.a.getItem(i)).c;
        if (downloadLocationCustomView.o != 6) {
            return;
        }
        String c = AbstractC6091ht0.c(downloadLocationCustomView.getContext(), AbstractC11893yn3.a, j2);
        ColorStateList b = Y50.b(downloadLocationCustomView.getContext(), R.color.0_resource_name_obfuscated_res_0x7f07014a);
        int color = downloadLocationCustomView.getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f070193);
        if (j2 < downloadLocationCustomView.p) {
            c = downloadLocationCustomView.getContext().getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14042a, c, downloadLocationCustomView.getContext().getText(R.string.0_resource_name_obfuscated_res_0x7f140422));
            ColorStateList valueOf = ColorStateList.valueOf(downloadLocationCustomView.getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705b0));
            int color2 = downloadLocationCustomView.getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f0705b0);
            EI2.h(1, 2, "MobileDownload.Location.Dialog.Suggestion.Events");
            color = color2;
            b = valueOf;
        }
        downloadLocationCustomView.m.setText(c);
        downloadLocationCustomView.m.setTextColor(b);
        downloadLocationCustomView.l.getBackground().mutate().setTint(color);
    }

    public C2815Vr0(DownloadLocationCustomView downloadLocationCustomView) {
        this.a = downloadLocationCustomView;
    }
}
