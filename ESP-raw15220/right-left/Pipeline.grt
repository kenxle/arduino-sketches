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
NumClasses: 2
NullRejectionThresholds:  71275.5 75166.6
ClassLabels:  1 2
DistanceMethod: 1
UseSmoothing: 0
SmoothingFactor: 5
UseZNormalisation: 0
OffsetUsingFirstSample: 0
ConstrainWarpingPath: 1
Radius: 0.2
RejectionMode: 0
NumberOfTemplates: 2
OverallAverageTemplateLength: 56
***************TEMPLATE***************
Template: 1
ClassLabel: 1
TimeSeriesLength: 58
TemplateThreshold: 71275.5
TrainingMu: 63915.1
TrainingSigma: 18401.2
AverageTemplateLength: 58
TimeSeries: 
-1309.01	-526.912	614.495	
-2525.32	-893.902	1290.81	
-4297.36	-1218.95	2045.76	
-6452.12	-1145.55	2265.95	
-8585.91	-505.941	1998.57	
-10352.7	783.768	1144.01	
-11631.9	2513.86	11.5825	
-12040.9	4605.71	-1456.38	
-11689.6	6697.55	-3086.86	
-8905.71	9927.07	-5624.34	
-6777.17	10938.9	-6269.19	
-4297.36	11457.9	-6415.99	
-1230.37	11615.2	-6090.94	
2460.5	11457.9	-5540.46	
6497.39	11012.3	-4848.42	
10308.8	10351.7	-4140.65	
13622.2	9423.77	-3259.87	
16416.6	8369.98	-2326.67	
18351.2	7289.98	-1299.1	
19142.8	6084.16	-250.553	
19121.9	4977.94	666.922	
18560.9	4112.89	1259.35	
17480.9	3431.34	1490.03	
15735.1	2713.09	1379.93	
13585.5	2057.75	1138.77	
11467.5	1344.74	950.029	
9097.78	411.535	803.233	
6450.21	-684.193	577.796	
3629.63	-1884.78	493.913	
536.423	-2990.99	509.641	
-2918.53	-3971.38	389.058	
-6483.58	-4836.43	174.107	
-9686.88	-5497.01	331.388	
-12360.7	-6120.89	614.495	
-15815.6	-7677.98	1196.44	
-15453.9	-7908.66	1427.12	
-14384.4	-7882.45	1552.94	
-12722.4	-7740.89	1663.04	
-10494.3	-7546.91	1725.95	
-7778.53	-7179.92	1699.74	
-5136.2	-6870.6	1448.09	
-2803.19	-6545.55	1353.72	
-868.626	-6225.75	1369.45	
882.442	-5795.84	1563.43	
2240.31	-5318.76	1757.41	
3047.68	-4778.76	1904.2	
3650.6	-4207.3	1977.6	
4222.05	-3510.02	1919.93	
4552.35	-2755.07	1647.31	
4699.14	-2078.76	1311.78	
4604.77	-1460.12	971	
4683.41	-851.96	714.107	
4861.67	-332.931	431	
4699.14	-28.8535	48.2816	
4311.18	217.554	-224.34	
3839.34	395.807	-266.282	
3052.93	453.477	-250.553	
2077.78	385.321	-145.699	
***************TEMPLATE***************
Template: 2
ClassLabel: 2
TimeSeriesLength: 59
TemplateThreshold: 75166.6
TrainingMu: 64576.2
TrainingSigma: 26475.9
AverageTemplateLength: 55
TimeSeries: 
1810.4	610.758	-156.184	
3010.99	1119.3	-261.039	
4311.18	1737.94	-533.66	
5328.27	2388.04	-1052.69	
6088.46	3819.3	-2719.87	
5684.77	4490.37	-3448.61	
5013.7	5171.92	-3941.43	
3902.25	5643.77	-4067.25	
772.345	5638.53	-3485.31	
-1125.52	5019.88	-2819.49	
-3143.97	4259.69	-1975.41	
-5235.81	3195.42	-696.184	
-6997.36	1973.86	771.777	
-8444.35	600.273	2265.95	
-9608.24	-642.252	3765.37	
-10583.4	-1973.9	5138.96	
-11495.6	-3342.25	6334.3	
-12135.2	-4631.96	7215.08	
-12444.5	-5696.23	7970.03	
-12119.5	-6472.15	8656.83	
-11500.9	-7022.64	9050.03	
-10887.5	-7546.91	9191.58	
-10531	-7929.63	9081.49	
-10599.1	-8097.4	8651.58	
-10730.2	-7657.01	7844.2	
-10378.9	-6435.46	6758.96	
-9005.32	-4511.38	5401.1	
-6509.79	-2141.67	3671	
-3762.61	133.671	1537.21	
-1461.05	1874.25	-953.078	
457.782	3357.94	-3480.07	
2486.71	4584.74	-5608.61	
7205.16	6519.3	-8046.48	
9297.01	6964.93	-8670.36	
10728.3	6902.02	-8969.19	
11651	6498.33	-8953.47	
12101.9	5811.53	-8434.44	
12117.6	4915.03	-7663.76	
11782.1	3992.31	-6589	
11226.3	2922.8	-5335.99	
10586.7	1879.5	-4198.32	
9732.15	851.923	-3175.99	
8699.34	86.4863	-2190.36	
7619.34	-773.32	-1314.83	
6628.46	-1544	-502.204	
5695.26	-2178.37	210.806	
4866.91	-2707.88	866.146	
3980.89	-3226.91	1364.2	
2796.03	-3704	1799.35	
1417.2	-4091.96	2140.13	
-113.674	-4186.33	2339.35	
-1434.84	-3939.92	2381.29	
-2221.25	-3373.71	2250.22	
-2488.63	-2576.81	2045.76	
-2451.93	-1910.99	1699.74	
-2362.8	-1481.09	1280.32	
-2488.63	-1276.62	797.99	
-2284.16	-794.29	121.68	
-1733.67	-532.154	116.437	
PostProcessingModule_1
GRT_CLASS_LABEL_TIMEOUT_FILTER_FILE_V1.0
NumInputDimensions: 1
NumOutputDimensions: 1
FilterMode: 0
TimeoutDuration: 500
