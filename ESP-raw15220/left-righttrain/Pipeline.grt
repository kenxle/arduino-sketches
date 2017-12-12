GRT_PIPELINE_FILE_V3.0
PipelineMode: CLASSIFICATION_MODE
NumPreprocessingModules: 0
NumFeatureExtractionModules: 0
NumPostprocessingModules: 1
Trained: 1
Info: 
PreProcessingModuleDatatypes:
FeatureExtractionModuleDatatypes:
ClassificationModuleDatatype:	DTW
PostProcessingModuleDatatypes:	ClassLabelTimeoutFilter
GRT_DTW_Model_File_V2.0
Trained: 1
UseScaling: 0
NumInputDimensions: 3
NumOutputDimensions: 1
NumTrainingIterationsToConverge: 48
MinNumEpochs: 0
MaxNumEpochs: 100
ValidationSetSize: 20
LearningRate: 0.1
MinChange: 1e-05
UseValidationSet: 0
RandomiseTrainingOrder: 1
UseNullRejection: 1
ClassifierMode: 1
NullRejectionCoeff: 0.4
NumClasses: 3
NullRejectionThresholds:  30789.6 31101.5 10799.2
ClassLabels:  1 2 3
DistanceMethod: 1
UseSmoothing: 0
SmoothingFactor: 5
UseZNormalisation: 0
OffsetUsingFirstSample: 0
ConstrainWarpingPath: 1
Radius: 0.2
RejectionMode: 0
NumberOfTemplates: 3
OverallAverageTemplateLength: 55
***************TEMPLATE***************
Template: 1
ClassLabel: 1
TimeSeriesLength: 56
TemplateThreshold: 30789.6
TrainingMu: 26244.3
TrainingSigma: 11363.2
AverageTemplateLength: 52
TimeSeries: 
96.7182	41.8944	124.103	
253.683	89.5445	51.2263	
367.202	147.005	-49.6797	
507.35	233.896	-153.389	
703.556	355.824	-328.573	
931.996	504.38	-554.21	
1236.12	687.973	-809.278	
1642.54	860.354	-1097.98	
2133.06	929.026	-1379.68	
2624.97	800.091	-1542.25	
3086.06	453.927	-1512.82	
3461.65	-98.2528	-1280.17	
3680.28	-834.026	-842.913	
3736.34	-1651.08	-303.346	
3313.1	-3182.89	778.59	
2845.01	-3733.67	1245.28	
2177.9	-4158.32	1578.83	
1331.42	-4440.01	1786.25	
426.064	-4500.28	1951.62	
-483.491	-4416.19	2048.32	
-1322.97	-4189.15	2038.51	
-2144.24	-3901.85	1922.19	
-3070.61	-3548.68	1824.09	
-4135.73	-3192.7	1734.39	
-6054.34	-2531.21	1433.08	
-6539.25	-2159.82	1197.63	
-6661.18	-1767.41	925.745	
-6493	-1351.17	632.837	
-6089.38	-912.508	314.703	
-5481.14	-452.825	-3.43113	
-4708.93	20.8723	-311.755	
-3824.6	514.191	-620.079	
-2867.4	986.487	-875.147	
-1840.12	1451.78	-1120.4	
-805.83	1817.56	-1333.43	
85.5064	2024.98	-1460.96	
854.915	2092.25	-1452.55	
1566.86	2078.23	-1309.6	
2177.9	2005.36	-1095.18	
2767.92	1939.49	-852.723	
3301.88	1893.24	-646.707	
3705.51	1894.64	-489.742	
3956.37	1912.86	-352.398	
4065.69	1919.87	-292.134	
4015.23	1907.25	-258.499	
3882.09	1925.47	-198.236	
3660.66	1942.29	-122.556	
3327.11	1908.66	-100.133	
2923.49	1880.63	-95.9283	
1645.34	1715.25	-44.0738	
979.646	1594.73	-27.2562	
489.13	1461.59	-41.2709	
124.748	1320.04	-67.8988	
-121.911	1214.93	-84.7165	
-320.921	1085.99	-90.3224	
-510.119	945.844	-95.9283	
***************TEMPLATE***************
Template: 2
ClassLabel: 2
TimeSeriesLength: 54
TemplateThreshold: 31101.5
TrainingMu: 26145.9
TrainingSigma: 12389.2
AverageTemplateLength: 56
TimeSeries: 
-697.917	-87.041	10.5836	
-1136.58	-246.809	-34.2635	
-1579.44	-466.84	-24.4532	
-2036.32	-776.565	2.17476	
-2432.94	-1187.2	110.088	
-2648.77	-1677.71	386.178	
-2193.29	-2644.73	1309.75	
-1656.52	-3016.12	1707.77	
-986.62	-3259.97	1964.24	
-252.248	-3337.05	2046.92	
543.788	-3217.93	1936.21	
1334.22	-2894.19	1661.52	
2020.94	-2412.08	1245.28	
2574.52	-1799.64	704.312	
3044.01	-1070.87	119.898	
3369.16	-325.291	-432.282	
3582.18	396.467	-950.826	
3662.06	1062.17	-1437.14	
3643.84	1657.79	-1856.18	
3663.46	2172.13	-2175.71	
3627.03	2472.05	-2402.75	
3436.43	2507.08	-2467.22	
3100.07	2345.91	-2359.31	
2674.03	2082.44	-2114.05	
2246.58	1769.91	-1696.41	
1814.92	1422.34	-1124.61	
1194.07	1025.73	-521.976	
294.326	601.082	28.8027	
-765.187	182.042	505.303	
-1663.53	-127.684	908.927	
-2865.99	-485.059	1340.58	
-3161.7	-573.352	1400.84	
-3198.14	-585.965	1472.32	
-3084.62	-559.337	1470.92	
-2951.48	-518.694	1353.19	
-2797.32	-450.022	1166.8	
-2596.91	-360.328	936.957	
-2353.06	-229.991	700.108	
-2054.54	-37.9895	464.661	
-1774.25	184.845	243.228	
-1219.26	582.863	-203.842	
-905.334	762.251	-379.026	
-619.434	920.617	-528.983	
-322.322	1066.37	-670.532	
-16.8011	1184.09	-785.453	
316.749	1248.56	-851.322	
650.3	1240.15	-886.359	
840.9	1114.02	-862.534	
917.981	950.048	-778.445	
975.441	794.485	-650.911	
1063.73	645.929	-474.326	
1084.76	494.57	-282.324	
976.843	320.787	-111.344	
518.561	46.0988	98.8763	
***************TEMPLATE***************
Template: 3
ClassLabel: 3
TimeSeriesLength: 54
TemplateThreshold: 10799.2
TrainingMu: 10278.4
TrainingSigma: 1302.07
AverageTemplateLength: 58
TimeSeries: 
15.4328	1.25174	-16.0444	
-22.4069	5.45615	-21.6503	
-39.2246	15.2665	-32.862	
-51.8379	22.2738	-34.2635	
-65.8526	2.65321	-21.6503	
-81.2688	8.2591	-7.63554	
-78.4658	13.865	25.9998	
-56.0423	16.6679	59.6351	
-39.2246	8.2591	97.4749	
-12.5966	-12.763	119.898	
-8.39222	-29.5807	114.293	
-5.58927	-30.9821	100.278	
-18.2025	-30.9821	83.4601	
0.0166141	-33.7851	45.6204	
15.4328	-14.1645	14.788	
4.22103	-8.55857	-13.2414	
5.6225	-16.9674	-42.6723	
2.81956	-1.55121	-42.6723	
18.2358	15.2665	-14.6429	
29.4475	11.062	-2.02965	
37.8564	26.4782	4.97771	
53.2726	40.493	14.788	
44.8637	50.3033	-11.84	
25.2431	40.493	-31.4606	
7.02397	48.9018	-58.0885	
-8.39222	55.9091	-74.9062	
-30.8158	72.7268	-70.7018	
-60.2467	83.9386	-45.4753	
-54.6408	97.9533	-9.03701	
-40.6261	86.7415	24.5983	
-13.9981	86.7415	40.0145	
2.81956	74.1283	76.4528	
8.42545	54.5077	107.285	
7.02397	53.1062	131.11	
25.2431	18.0694	152.132	
28.0461	8.2591	131.11	
23.8416	2.65321	100.278	
-1.38486	-5.75563	73.6498	
-28.0128	-2.95268	47.0219	
-53.2393	-28.1792	4.97771	
-42.0275	-52.0042	-10.4385	
-39.2246	-56.2086	-9.03701	
-22.4069	-81.4351	-6.23407	
1.41809	-92.6469	-3.43113	
36.4549	-89.844	-4.8326	
65.8858	-64.6175	7.78065	
100.923	-47.7998	-13.2414	
114.937	-39.391	-31.4606	
134.558	-8.55857	-41.2709	
128.952	9.66057	-37.0665	
93.9152	22.2738	-59.49	
63.0829	27.8797	-46.8768	
68.6887	20.8723	-48.2782	
65.8858	33.4856	-38.4679	
PostProcessingModule_1
GRT_CLASS_LABEL_TIMEOUT_FILTER_FILE_V1.0
NumInputDimensions: 1
NumOutputDimensions: 1
FilterMode: 0
TimeoutDuration: 500
