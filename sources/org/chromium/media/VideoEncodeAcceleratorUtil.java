package org.chromium.media;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import defpackage.C11443xV;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class VideoEncodeAcceleratorUtil {
    public static final String[] a = {"video/x-vnd.on2.vp8", "video/x-vnd.on2.vp9", "video/av01", "video/avc"};

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class SupportedProfileAdapter {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;

        public int getProfile() {
            return this.a;
        }

        public int getMaxWidth() {
            return this.b;
        }

        public int getMaxHeight() {
            return this.c;
        }

        public int getMinWidth() {
            return this.d;
        }

        public int getMinHeight() {
            return this.e;
        }

        public int getMaxFramerateNumerator() {
            return this.f;
        }

        public int getMaxFramerateDenominator() {
            return this.g;
        }

        public boolean supportsCbr() {
            return this.h;
        }

        public boolean supportsVbr() {
            return this.i;
        }
    }

    public static SupportedProfileAdapter[] getSupportedProfiles() {
        ArrayList arrayList;
        boolean isHardwareAccelerated;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z;
        MediaCodecInfo[] mediaCodecInfoArr;
        String[] strArr;
        int i;
        String str;
        ArrayList arrayList2;
        boolean isHardwareAccelerated2;
        boolean isHardwareAccelerated3;
        try {
            int i2 = 0;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            HashSet hashSet = new HashSet();
            String[] strArr2 = a;
            int i3 = 0;
            while (i3 < 4) {
                String str2 = strArr2[i3];
                int length = codecInfos.length;
                int i4 = i2;
                while (i4 < length) {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i4];
                    if (mediaCodecInfo.isEncoder()) {
                        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                        if (isHardwareAccelerated || !(!str2.equalsIgnoreCase("video/avc"))) {
                            try {
                                capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str2);
                                int[] iArr = capabilitiesForType.colorFormats;
                                int length2 = iArr.length;
                                int i5 = i2;
                                while (true) {
                                    if (i5 >= length2) {
                                        z = false;
                                        break;
                                    }
                                    if (iArr[i5] == 21) {
                                        z = true;
                                        break;
                                    }
                                    i5++;
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            if (z) {
                                MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
                                boolean isBitrateModeSupported = encoderCapabilities.isBitrateModeSupported(2);
                                boolean isBitrateModeSupported2 = encoderCapabilities.isBitrateModeSupported(1);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
                                Range<Integer> supportedHeightsFor = videoCapabilities.getSupportedHeightsFor(supportedWidths.getUpper().intValue());
                                mediaCodecInfoArr = codecInfos;
                                strArr = strArr2;
                                boolean z2 = !supportedHeightsFor.getUpper().equals(supportedWidths.getUpper()) && videoCapabilities.isSizeSupported(supportedHeightsFor.getUpper().intValue(), supportedWidths.getUpper().intValue());
                                Range<Integer> supportedFrameRates = videoCapabilities.getSupportedFrameRates();
                                HashSet hashSet2 = new HashSet();
                                i = length;
                                int a2 = C11443xV.a(str2);
                                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                                str = str2;
                                int length3 = codecProfileLevelArr.length;
                                arrayList2 = arrayList3;
                                int i6 = 0;
                                while (i6 < length3) {
                                    int i7 = length3;
                                    try {
                                        hashSet2.add(Integer.valueOf(C11443xV.c(a2, codecProfileLevelArr[i6].profile)));
                                    } catch (RuntimeException unused2) {
                                    }
                                    i6++;
                                    length3 = i7;
                                }
                                isHardwareAccelerated2 = mediaCodecInfo.isHardwareAccelerated();
                                if (isHardwareAccelerated2) {
                                    hashSet.addAll(hashSet2);
                                }
                                isHardwareAccelerated3 = mediaCodecInfo.isHardwareAccelerated();
                                ArrayList arrayList5 = isHardwareAccelerated3 ? arrayList2 : arrayList4;
                                Iterator it = hashSet2.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Integer) it.next()).intValue();
                                    SupportedProfileAdapter supportedProfileAdapter = new SupportedProfileAdapter();
                                    supportedProfileAdapter.a = intValue;
                                    supportedProfileAdapter.d = supportedWidths.getLower().intValue();
                                    supportedProfileAdapter.e = supportedHeightsFor.getLower().intValue();
                                    supportedProfileAdapter.b = supportedWidths.getUpper().intValue();
                                    supportedProfileAdapter.c = supportedHeightsFor.getUpper().intValue();
                                    supportedProfileAdapter.f = supportedFrameRates.getUpper().intValue();
                                    supportedProfileAdapter.g = 1;
                                    supportedProfileAdapter.h = isBitrateModeSupported;
                                    supportedProfileAdapter.i = isBitrateModeSupported2;
                                    arrayList5.add(supportedProfileAdapter);
                                    if (z2) {
                                        SupportedProfileAdapter supportedProfileAdapter2 = new SupportedProfileAdapter();
                                        supportedProfileAdapter2.a = intValue;
                                        supportedProfileAdapter2.d = supportedHeightsFor.getLower().intValue();
                                        supportedProfileAdapter2.e = supportedWidths.getLower().intValue();
                                        supportedProfileAdapter2.b = supportedHeightsFor.getUpper().intValue();
                                        supportedProfileAdapter2.c = supportedWidths.getUpper().intValue();
                                        supportedProfileAdapter2.f = supportedFrameRates.getUpper().intValue();
                                        supportedProfileAdapter2.g = 1;
                                        supportedProfileAdapter2.h = isBitrateModeSupported;
                                        supportedProfileAdapter2.i = isBitrateModeSupported2;
                                        arrayList5.add(supportedProfileAdapter2);
                                    }
                                }
                                i4++;
                                strArr2 = strArr;
                                codecInfos = mediaCodecInfoArr;
                                length = i;
                                str2 = str;
                                arrayList3 = arrayList2;
                                i2 = 0;
                            }
                        }
                    }
                    mediaCodecInfoArr = codecInfos;
                    arrayList2 = arrayList3;
                    strArr = strArr2;
                    str = str2;
                    i = length;
                    i4++;
                    strArr2 = strArr;
                    codecInfos = mediaCodecInfoArr;
                    length = i;
                    str2 = str;
                    arrayList3 = arrayList2;
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            ArrayList arrayList6 = arrayList3;
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                SupportedProfileAdapter supportedProfileAdapter3 = (SupportedProfileAdapter) it2.next();
                if (hashSet.contains(Integer.valueOf(supportedProfileAdapter3.a))) {
                    arrayList = arrayList6;
                } else {
                    arrayList = arrayList6;
                    arrayList.add(supportedProfileAdapter3);
                }
                arrayList6 = arrayList;
            }
            ArrayList arrayList7 = arrayList6;
            SupportedProfileAdapter[] supportedProfileAdapterArr = new SupportedProfileAdapter[arrayList7.size()];
            arrayList7.toArray(supportedProfileAdapterArr);
            return supportedProfileAdapterArr;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
