package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MD3 extends AbstractC1649Ms {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ OD3 j;

    public MD3(OD3 od3, boolean z, boolean z2) {
        this.j = od3;
        this.h = z;
        this.i = z2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        boolean z = this.h;
        OD3 od3 = this.j;
        if (!z) {
            od3.getClass();
            AbstractC4851eH1.f("tabmodel", "Starting to perform legacy migration.", new Object[0]);
            File a = OA3.a();
            File[] listFiles = a.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                File filesDir = V60.a.getFilesDir();
                File file = new File(filesDir, "tab_state");
                if (file.exists() && !file.renameTo(new File(a, od3.d()))) {
                    AbstractC4851eH1.a("tabmodel", TM0.a("Failed to rename file: ", file), new Object[0]);
                }
                File[] listFiles2 = filesDir.listFiles();
                if (listFiles2 != null) {
                    for (File file2 : listFiles2) {
                        if (QA3.b(file2.getName()) != null && !file2.renameTo(new File(a, file2.getName()))) {
                            AbstractC4851eH1.a("tabmodel", TM0.a("Failed to rename file: ", file2), new Object[0]);
                        }
                    }
                }
            }
            O83.a.p("org.chromium.chrome.browser.tabmodel.TabPersistentStore.HAS_RUN_FILE_MIGRATION", true);
            AbstractC4851eH1.f("tabmodel", "Finished performing legacy migration.", new Object[0]);
        }
        if (this.i) {
            return null;
        }
        od3.getClass();
        AbstractC4851eH1.f("tabmodel", "Starting to perform multi-instance migration.", new Object[0]);
        File a2 = OA3.a();
        File file3 = new File(a2, od3.d());
        File file4 = new File(a2, "tab_state");
        if (file3.exists()) {
            AbstractC4851eH1.a("tabmodel", "New metadata file already exists", new Object[0]);
        } else if (file4.exists() && !file4.renameTo(file3)) {
            AbstractC4851eH1.a("tabmodel", TM0.a("Failed to rename file: ", file4), new Object[0]);
        }
        int i = -1;
        int i2 = -1;
        while (i < od3.e) {
            if (i != 0) {
                File file5 = new File(NA3.a, Integer.toString(i));
                if (file5.exists()) {
                    File file6 = new File(file5, "tab_state");
                    if (file6.exists() && !file6.renameTo(new File(a2, OD3.q(i)))) {
                        AbstractC4851eH1.a("tabmodel", TM0.a("Failed to rename file: ", file6), new Object[0]);
                    }
                    File[] listFiles3 = file5.listFiles();
                    if (listFiles3 != null) {
                        int length = listFiles3.length;
                        int i3 = 0;
                        while (i3 < length) {
                            File file7 = listFiles3[i3];
                            if (QA3.b(file7.getName()) != null) {
                                if (i != i2) {
                                    File file8 = new File(a2, file7.getName());
                                    if (!file8.exists() || file8.lastModified() <= file7.lastModified()) {
                                        if (!file7.renameTo(file8)) {
                                            AbstractC4851eH1.a("tabmodel", TM0.a("Failed to rename file: ", file7), new Object[0]);
                                        }
                                    } else if (!file7.delete()) {
                                        AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete file: ", file7), new Object[0]);
                                    }
                                } else if (!file7.delete()) {
                                    AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete file: ", file7), new Object[0]);
                                }
                            }
                            i3++;
                            i2 = -1;
                        }
                    }
                    if (!file5.delete()) {
                        AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete directory: ", file5), new Object[0]);
                    }
                }
            }
            i++;
            i2 = -1;
        }
        O83.a.p("org.chromium.chrome.browser.tabmodel.TabPersistentStore.HAS_RUN_MULTI_INSTANCE_FILE_MIGRATION", true);
        AbstractC4851eH1.f("tabmodel", "Finished performing multi-instance migration.", new Object[0]);
        return null;
    }
}
