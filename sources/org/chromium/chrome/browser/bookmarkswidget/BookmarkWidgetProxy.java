package org.chromium.chrome.browser.bookmarkswidget;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.chrome.R;
import defpackage.AbstractC2281Ro1;
import defpackage.C6537jB;
import defpackage.V60;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkWidgetProxy extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!(V60.a.getPackageName() + ".CHANGE_FOLDER").equals(intent.getAction())) {
            Intent intent2 = new Intent(intent);
            intent2.setClass(this, ChromeLauncherActivity.class);
            intent2.putExtra("org.chromium.chrome.browser.webapp_source", 3);
            intent2.putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true);
            try {
                intent2.addFlags(268435456);
                startActivity(intent2);
            } catch (Exception e) {
                Log.w("BookmarkWidgetProxy", "Failed to start intent activity", e);
            }
        } else {
            int p = AbstractC2281Ro1.p(-1, intent, "appWidgetId");
            String w = AbstractC2281Ro1.w(intent, "folderId");
            if (p >= 0 && w != null) {
                C6537jB.b(p).edit().putString("bookmarkswidget.current_folder", w).apply();
                AppWidgetManager.getInstance(V60.a).notifyAppWidgetViewDataChanged(p, R.id.bookmarks_list);
            }
        }
        finish();
    }
}
