package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.chrome.browser.browsing_data.ConfirmImportantSitesDialogFragment;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k30 */
/* loaded from: classes.dex */
public final class C6835k30 extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final String[] a;
    public final int g;
    public final C6964kR2 h;
    public final /* synthetic */ ConfirmImportantSitesDialogFragment i;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6835k30(ConfirmImportantSitesDialogFragment confirmImportantSitesDialogFragment, String[] strArr, String[] strArr2, Resources resources) {
        super(confirmImportantSitesDialogFragment.getActivity(), R.layout.0_resource_name_obfuscated_res_0x7f0e0093, strArr);
        this.i = confirmImportantSitesDialogFragment;
        this.a = strArr;
        confirmImportantSitesDialogFragment.t0 = strArr2;
        this.g = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08017a);
        this.h = AbstractC4855eI0.c(getContext());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ConfirmImportantSitesDialogFragment confirmImportantSitesDialogFragment = this.i;
        if (view == null) {
            view = LayoutInflater.from(confirmImportantSitesDialogFragment.getActivity()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0093, viewGroup, false);
            C7179l30 c7179l30 = new C7179l30();
            c7179l30.a = (CheckBox) view.findViewById(R.id.icon_row_checkbox);
            c7179l30.b = (ImageView) view.findViewById(R.id.icon_row_image);
            view.setTag(c7179l30);
        }
        C7179l30 c7179l302 = (C7179l30) view.getTag();
        String str = this.a[i];
        c7179l302.a.setChecked(((Boolean) confirmImportantSitesDialogFragment.u0.get(str)).booleanValue());
        c7179l302.a.setText(str);
        String str2 = confirmImportantSitesDialogFragment.t0[i];
        C6491j30 c6491j30 = new C6491j30(this, c7179l302, str2);
        c7179l302.c = c6491j30;
        LargeIconBridge largeIconBridge = confirmImportantSitesDialogFragment.w0;
        largeIconBridge.getClass();
        largeIconBridge.b(new GURL(str2), this.g, c6491j30);
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = this.a[i];
        C7179l30 c7179l30 = (C7179l30) view.getTag();
        ConfirmImportantSitesDialogFragment confirmImportantSitesDialogFragment = this.i;
        boolean z = !((Boolean) confirmImportantSitesDialogFragment.u0.get(str)).booleanValue();
        confirmImportantSitesDialogFragment.u0.put(str, Boolean.valueOf(z));
        c7179l30.a.setChecked(z);
    }
}
