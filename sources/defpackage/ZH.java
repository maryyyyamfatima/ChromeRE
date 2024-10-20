package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategoryCardView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ZH implements QK2 {
    public int b() {
        return R.layout.f57500_resource_name_obfuscated_res_0x7f0e00ff;
    }

    public int c() {
        return R.layout.f57580_resource_name_obfuscated_res_0x7f0e0107;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View] */
    @Override // defpackage.QK2
    public final Object a(int i, RecyclerView recyclerView) {
        ExploreSitesCategoryCardView exploreSitesCategoryCardView;
        if (i != 0) {
            exploreSitesCategoryCardView = i != 1 ? i != 2 ? null : AbstractC9192qu3.a(recyclerView, R.layout.f57540_resource_name_obfuscated_res_0x7f0e0103, recyclerView, false) : AbstractC9192qu3.a(recyclerView, R.layout.f57550_resource_name_obfuscated_res_0x7f0e0104, recyclerView, false);
        } else {
            ExploreSitesCategoryCardView exploreSitesCategoryCardView2 = (ExploreSitesCategoryCardView) LayoutInflater.from(recyclerView.getContext()).inflate(b(), (ViewGroup) recyclerView, false);
            exploreSitesCategoryCardView2.p = c();
            exploreSitesCategoryCardView = exploreSitesCategoryCardView2;
        }
        return new YH(exploreSitesCategoryCardView);
    }
}
